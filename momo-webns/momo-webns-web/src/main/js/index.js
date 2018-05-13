import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route , IndexRoute ,Switch} from 'react-router-dom';

//import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
//import 'bootstrap/dist/css/bootstrap.min.css';


import './scss/app.scss';

import './App.css'

import Layout from "./components/Layout";
import RegistrationGoodsSpec from './components/RegistrationGoodsSpec';


const Root = () => (
   <Layout>
   	  <Router>
		<Switch>
		  <Route exact path="/" component={RegistrationGoodsSpec} />
		</Switch>
     </Router>
   </Layout>
);

	
ReactDOM.render(
  <Root/>,  
  document.getElementById('react')
);


