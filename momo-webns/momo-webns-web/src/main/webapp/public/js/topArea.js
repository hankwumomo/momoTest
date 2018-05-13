﻿document.write('<script>');
document.write('$(function(){ ');
document.write('  var headerTabTitle = ".header .mainmenu ul li";');
document.write('  var headerTabContent = ".header .subnavwrap";');
document.write('  $(headerTabTitle + ":first").addClass("selected");');
document.write('  $(headerTabContent).not(":first").hide();');
document.write('  $(headerTabTitle).unbind("click").bind("click", function(){');
document.write('    $(this).siblings("li").removeClass("selected").end().addClass("selected");');
document.write('    var index = $(headerTabTitle).index($(this));');
document.write('    $(headerTabContent).eq(index).siblings(headerTabContent).hide().end().show();');
document.write('  });');
document.write('/** 點選浮層關閉按鈕 **/');
document.write('  $(".popup h2 a.closeBtn").click(function(){');
document.write('    $(".popup").removeAttr("style");');
document.write('  });');
document.write('});');
document.write('</script>');

document.write('  <div class="header">');
document.write('    <!-- logo -->');
document.write('    <div class="topwrap">');
document.write('      <div class="top">');
document.write('        <dl>');
document.write('          <dt class="timeremind">*操作剩餘時間:30分鐘</dt>');
document.write('          <dd class="gohome"><a href="index.html" title="首頁"><img src="img/iconhome.png" width="30" height="30" border="0" /></a></dd>');
document.write('          <dd class="logout"><a href="#" title="登出"><img src="img/iconlogout.png" width="30" height="30" border="0" /></a></dd>');
document.write('        </dl>');
document.write('      </div>');
document.write('    </div>');
document.write('    ');
document.write('    <!-- 主選單 -->');
document.write('    <div class="mainmenu">');
document.write('      <ul>');
document.write('        <li><a href="#"><span></span>商品管理</a></li>');
document.write('        <li><a href="#"><span></span>結帳管理</a></li>');
document.write('        <li><a href="#"><span></span>品管設定</a></li>');
document.write('        <li><a href="#"><span></span>品管驗收</a></li>');
document.write('        <li><a href="#"><span></span>Front Admin</a></li>');
document.write('        <li><a href="#"><span></span>財務管理</a></li>');
document.write('        <li><a href="#"><span></span>test01</a></li>');
document.write('        <li><a href="#"><span></span>test02</a></li>');
document.write('      </ul>');
document.write('    <!-- 20160308_常用程式集 -->');
document.write('      <dl class="commonPrograms">');
document.write('        <dt><span>×</span>常用程式集</dt>');
document.write('        <dd><a href="#">[A102]商品資料查詢</a></dd>');
document.write('        <dd><a href="#">[C201]商品查詢</a></dd>');
document.write('        <dd><a href="#">[C301]首頁區塊維護</a></dd>');
document.write('      </dl>');
document.write('    </div>');
document.write('    ');
document.write('    <!-- 商店次選單 -->');
document.write('    <div class="subnavwrap">');
document.write('      <div class="subnav">');
document.write('        <ul>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M101編碼管理</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="#" title="M10101">M10101</a></dd>');
document.write('              <dd><a href="#" title="M10102">M10102</a></dd>');
document.write('              <dd><a href="#" title="M10103">M10103</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M102供應商管理</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="#.html" title="M10201">M10201</a></dd>');
document.write('              <dd><a href="#.html" title="M10202">M10202</a></dd>');
document.write('              <dd><a href="#.html" title="M10203">M10203</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M103商品管理</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="M10301.html" title="M10301 商品登錄">M10301 商品登錄</a></dd>');
document.write('              <dd><a href="#.html" title="M10302 商品登錄">M10302 SET商品登錄</a></dd>');
document.write('              <dd><a href="#.html" title="M10302-1 SET商品登錄(網路)">M10302-1 SET商品登錄(網路)</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M104促銷管理</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="#.html" title="M10401">M10401</a></dd>');
document.write('              <dd><a href="#.html" title="M10402">M10402</a></dd>');
document.write('              <dd><a href="#.html" title="M10403">M10403</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M105通路管理</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="#.html" title="M10501">M10501</a></dd>');
document.write('              <dd><a href="#.html" title="M10505">M10505</a></dd>');
document.write('              <dd><a href="#.html" title="M10506">M10506</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M106變動成本</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="#.html" title="M10601">M10601 變動成本登錄</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M107商品異動</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="#.html" title="M10701">M10701</a></dd>');
document.write('              <dd><a href="#.html" title="M10702">M10702</a></dd>');
document.write('              <dd><a href="#.html" title="M10703">M10703</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('        </ul>');
document.write('      </div>');
document.write('    </div>');
document.write('   ');
document.write('    <!-- 客服次選單 -->');
document.write('    <div class="subnavwrap">');
document.write('      <div class="subnav">');
document.write('        <ul>');
document.write('          <li>');
document.write('            <a class="topMenu"><span></span>M201-1</a>');
document.write('            <dl class="bottomnav">');
document.write('              <dd><a href="A101.html" title="M20101">M20101</a></dd>');
document.write('              <dd><a href="#.html" title="M20102">M20102</a></dd>');
document.write('              <dd><a href="#.html" title="M20103">M20103</a></dd>');
document.write('            </dl>');
document.write('          </li>');
document.write('        </ul>');
document.write('      </div>');
document.write('    </div>');
document.write('   ');
document.write('  </div>');