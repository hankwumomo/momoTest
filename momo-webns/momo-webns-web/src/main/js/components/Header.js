import React, { Component } from 'react';
import ReactDOM from 'react-dom'


class Header extends Component {

  render() {
    return (
      <div>
      
       <div class="header">
        {/* logo */}
        <div class="topwrap">
          <div class="top">
            <dl>
              <dt class="timeremind"><span>林小芝</span><span>2018/04/19</span><span>*操作時間剩餘10分鐘</span></dt>
              <dd class="gohome"><a href="index.html" title="首頁"><img src="img/iconhome.png" width="30" height="30" border="0" /></a></dd>
              <dd class="logout"><a href="#" title="登出"><img src="img/iconlogout.png" width="30" height="30" border="0" /></a></dd>
            </dl>
          </div>
        </div>
         
        {/*主選單*/}
        <div class="mainmenu">
          <ul>
            <li><a href="#"><span></span>商品管理</a></li>
            <li><a href="#"><span></span>結帳管理</a></li>
            <li><a href="#"><span></span>品管設定</a></li>
            <li><a href="#"><span></span>品管驗收</a></li>
            <li><a href="#"><span></span>Front Admin</a></li>
            <li><a href="#"><span></span>財務管理</a></li>
            <li><a href="#"><span></span>test01</a></li>
            <li><a href="#"><span></span>test02</a></li>
          </ul>
          {/* 20160308_常用程式集 */}
          <dl class="commonPrograms">
            <dt><span>×</span>常用程式集</dt>
            <dd><a href="#">[A102]商品資料查詢</a></dd>
            <dd><a href="#">[C201]商品查詢</a></dd>
            <dd><a href="#">[C301]首頁區塊維護</a></dd>
          </dl>
        </div>
        
       {/* 商品管理次選單 */}
        <div class="subnavwrap">
          <div class="subnav">
            <ul>
              <li>
                <a class="topMenu"><span></span>M101編碼管理</a>
                <dl class="bottomnav">
                  <dd><a href="#" title="M10101">M10101</a></dd>
                  <dd><a href="#" title="M10102">M10102</a></dd>
                  <dd><a href="#" title="M10103">M10103</a></dd>
                </dl>
              </li>
              <li>
                <a class="topMenu"><span></span>M102供應商管理</a>
                <dl class="bottomnav">
                  <dd><a href="#.html" title="M10201">M10201</a></dd>
                  <dd><a href="#.html" title="M10202">M10202</a></dd>
                  <dd><a href="#.html" title="M10203">M10203</a></dd>
                </dl>
              </li>
              <li>
                <a class="topMenu"><span></span>M103商品管理</a>
                <dl class="bottomnav">
                  <dd><a href="M10301.html" title="M10301 商品登錄">M10301 商品登錄</a></dd>
                  <dd><a href="#.html" title="M10302 商品登錄">M10302 SET商品登錄</a></dd>
                  <dd><a href="#.html" title="M10302-1 SET商品登錄(網路)">M10302-1 SET商品登錄(網路)</a></dd>
                  <dd><a href="M10304.html" title="M10304 商品規格書登錄">M10304 商品規格書登錄</a></dd>
                </dl>
              </li>
              <li>
                <a class="topMenu"><span></span>M104促銷管理</a>
                <dl class="bottomnav">
                  <dd><a href="#.html" title="M10401">M10401</a></dd>
                  <dd><a href="#.html" title="M10402">M10402</a></dd>
                  <dd><a href="#.html" title="M10403">M10403</a></dd>
                </dl>
              </li>
              <li>
                <a class="topMenu"><span></span>M105通路管理</a>
                <dl class="bottomnav">
                  <dd><a href="#.html" title="M10501">M10501</a></dd>
                  <dd><a href="#.html" title="M10505">M10505</a></dd>
                  <dd><a href="#.html" title="M10506">M10506</a></dd>
                </dl>
              </li>
              <li>
                <a class="topMenu"><span></span>M106變動成本</a>
                <dl class="bottomnav">
                  <dd><a href="#.html" title="M10601">M10601 變動成本登錄</a></dd>
                </dl>
              </li>
              <li>
                <a class="topMenu"><span></span>M107商品異動</a>
                <dl class="bottomnav">
                  <dd><a href="#.html" title="M10701">M10701</a></dd>
                  <dd><a href="#.html" title="M10702">M10702</a></dd>
                  <dd><a href="#.html" title="M10703">M10703</a></dd>
                </dl>
              </li>
            </ul>
          </div>
        </div>
       
     
             
      </div>
        
        
        
        <div class="nav">
        <dl class="list">
          <dd><a href="index.html">首頁</a></dd>
          <dd><a href="#">商品/對帳</a></dd>
          <dd><a>商品管理</a></dd>
          <dd><a>M103商品管理</a></dd>
          <dt>M10304商品規格書登錄</dt>
        </dl>
      </div>
        
        
     </div>
    );
  }
}

export default Header;