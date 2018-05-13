import React, { Component } from 'react';
import ReactDOM from 'react-dom'
import axios from 'axios';


class RegistrationGoodsSpec extends Component {
  constructor() {
    super();
    
    this.state = {
    	goodsId:"",	
    	goodsName: "",
    	goodsSpec:[]
     };
    
    this.handleContentChange = this.handleContentChange.bind(this);
    this.handleIdBlur = this.handleIdBlur.bind(this);
    this.handleQuery = this.handleQuery.bind(this);
    this.handleSave = this.handleSave.bind(this);
  }
  
  handleContentChange(gsno , evt) {
	 var gs =  this.state.goodsSpec.find(gs=>{
		  if(gs.no == gsno)return gs;
	  })
	 gs.content = evt.target.value;
  }
    
  handleIdBlur(evt) {
	  this.setState({ goodsId: evt.target.value });
	 axios.get('/mgs/gn/'+evt.target.value)
     .then(res => {
       this.setState({ goodsName: res.data });
     });
  }
  
  handleQuery(evt) {
	 axios.get('/mgs/ggs/'+ this.state.goodsId)
     .then(res => {
       this.setState({ goodsSpec: res.data });
       
     });
  }
  
  handleSave(evt) {
	  console.log("1234")
	  
	
	   console.log(this.state)
	   var gsList = JSON.stringify(this.state.goodsSpec);
	  console.log(gsList)
	   
	  
	  

	   // const { name, address, city, phone, email } = this.state;

	    
	    axios.post('/mgs/sv',  gsList )
	      .then((result) => {
	        this.props.history.push("/")
	      });
	      
	  
	  /*
		 axios.get('/mgs/ggs/'+ this.state.goodsId)
	     .then(res => {
	       this.setState({ goodsSpec: res.data });
	       
	     });
		*/
  }

  render() {
    return (
      <div>
        
        <div class="box">
        <div class="column">查詢條件
          <a class="btn" href="javascript:void(0)">QC附件上傳</a>
          <a class="btn" href="javascript:void(0)">編輯專推(HTML)</a>
          <a class="btn" onclick="confirm('確定是否要覆蓋現有規格資料')">SET規格/圖複製</a>
          <a class="btn" onclick="alert('訊息文字etc.以前的資料不能刪除')">alert提示按鈕</a>
        </div>
        <div class="inner">        
          <ul>
            <li class="noleft">
              <b>商品編碼/名：</b>
              <input type="text" size="10" onBlur={this.handleIdBlur.bind(this)} />
              <input type="text" size="45" value={this.state.goodsName} />
            </li>
            <li class="buttonArea"><button class="check" onClick={this.handleQuery.bind(this)}>查詢</button><button class="check" onClick={this.handleSave.bind(this)} >儲存</button><button class="check showPrint">預覽列印</button></li>
          </ul>
      </div>
      </div>
      <div class="box">
      <div class="column">查詢結果<a class="btn editCopy" href="javascript:void(0)">規格書複製</a></div>
      
      <div class="inner">        
      <table class="m10304tb" border="0" cellpadding="3" cellspacing="0" width="100%">
      <thead>
        <tr>
          <th>No.</th>
          <th>編碼</th>
          <th>敘述書主題</th>
          <th>敘述書內容</th>
          <th class="copy"><label>CHECK<input type="checkbox"/></label></th>
        </tr>
      </thead>
      <tbody>
	    {this.state.goodsSpec.map(c =>	      
	      <tr>
          <td>{c.no}</td>
          <td>{c.id}</td>
          <td>{c.title}</td>
          <td><textarea rows="5" cols="70" onChange={this.handleContentChange.bind(this , c.no)} >{c.content}</textarea></td>
          </tr>
	    )}
      
      </tbody>
    </table>

      </div>
      </div>
             
      </div>
    );
  }
}

export default RegistrationGoodsSpec;