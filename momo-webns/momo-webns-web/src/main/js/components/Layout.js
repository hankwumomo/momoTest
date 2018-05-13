import React, { Component } from 'react';

import Footer from "./Footer";
import Header from "./Header";



const Layout = props => ({
  render() {
    return (
    		
   <div>
   	<Header/>
    <div class="content">
    {this.props.children}
    </div>
    	      	        
    <Footer />
    </div> 		
    		
    );
  }
});

export default Layout;