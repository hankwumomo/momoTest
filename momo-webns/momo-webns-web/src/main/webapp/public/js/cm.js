/*********************************************** 20180403 webns模組化 by zhlin ************************************************/

$(function(){ 
/*********************************************** 共用 ************************************************/
  
/** .Tabmenu切換頁籤功能 **/
var tabTitle = ".column .Tabmenu ul li";
var tabContent = ".content .box .inner .TabContent .TabContentD";
$(tabTitle + ":first").addClass("selected");
$(tabContent).not(":first").hide();
$(tabTitle).unbind("click").bind("click", function(){
  $(this).siblings("li").removeClass("selected").end().addClass("selected");
  var index = $(tabTitle).index($(this));
  $(tabContent).eq(index).siblings(tabContent).hide().end().show();
});
  
/** 常用程式集**/	
$(".commonPrograms").delegate("dt","click",function(){
  $(this).parents(".commonPrograms").toggleClass("opencommonPrograms");
});
});

/** 彈出視窗時的黑透明背景 **/
function bkArea() {
  $('body').append('<div class="fancybox-overlay"></div>');
  //控制body移除卷軸
  $('body,html').css({'width':'100%','height':'100%','overflow':'hidden'});
  $('.fancybox-overlay,.popup h2 a.closeBtn').click(function() {
    $('.fancybox-overlay').remove();
    //關閉所有浮層，將body卷軸復原
    $('body,html,.popup').removeAttr('style');
  });
}

$(window).resize(function(){
  fixedFooter();
  return;
});

/*********************************************** 共用 ************************************************/

/** 20160308_index_公告浮層**/
function index() {
		$(".content .box .news ul li ").delegate("a","click",function(){
			bkArea();
			$(".newsItem").css({"left":($("html")[0].clientWidth/2)-($(".newsItem").width()/2),"top":($("html")[0].clientHeight/2)-($(".newsItem").height()/2)}).show();	
			});
		$(".newsItem h2, .newsItem .closeBtnitem").delegate(".closebox, button","click",function(){
			$(".newsItem, .fancybox-overlay").removeAttr("style");
		  });
		}

function fixedFooter() {
	var viewHeight = $(window).height();
	var headerHeight = $(".header")[0].clientHeight;
	var navHeight = $(".nav")[0].clientHeight;
	var box01Height = $(".content .box")[0].clientHeight + 10;
//	var footerHeight = $(".footer")[0].clientHeight;
//	var viewHeight = viewHeight - (headerHeight + navHeight + box01Height + footerHeight) - 64;
	$(".fixedTitle").css({"height":viewHeight});
	$(".fixedTitle .basictable").css({"height":viewHeight});
}

/** 固定標題表格 **/
function fixedTitle(tableH) {
	//$(this).removeClass("fixed");/** 先清掉固定標題 **/
	var _rootDiv = $(".fixedTitle").eq(0); /** 單純一列的表格 **/
	var basicbox = $(".basictable", _rootDiv);
	if ($("table", basicbox).height() <= tableH) {
		basicbox.css({"height":($("table", basicbox).height() + 1)});
		$("tbody tr:odd",basicbox).addClass("odd"); /** 隔行加上背景色 **/
		fixedFooter();
		return;
	} else {
		var fixedbox = $("<div/>").prependTo(_rootDiv).addClass("fixed");
		var fixedtable = $("<table/>").prependTo(fixedbox).addClass("viewtable").css({"width":($("table", basicbox).outerWidth())}).attr({border:0,cellpadding:3,cellspacing:0});
		basicbox.css({"height":tableH});
		_rootDiv.css({"width":$(".fixed table").outerWidth()+17, "height":tableH});
		$(".viewtable", _rootDiv).css({"width":$(".fixed .viewtable").outerWidth()});
		basicbox.css({"top":(0 - ($("thead", basicbox).height()+1))}); /** 將原本表格往上提標題的高度(+1是將底線加上；用0減是要變成負數) **/
		fixedtable.append($("thead", basicbox).html()); /** 將原表格內的標題複製一份到fixed裡當成固定時的標題 **/
		for (i=0; i<=$("th",basicbox).length; i++) { /** 將原標題各格的寬度寫入固定標題各格裡(讓固定標題能跟原表格寬度相同) **/
			$("th", fixedtable).eq(i).css({"width":($("th", basicbox).eq(i).width())});
			$("th", basicbox).eq(i).css({"width":($("th", fixedtable).eq(i).width())});/** new控制一樣的寬度 **/
		}
		$("tbody tr:odd",basicbox).addClass("odd"); /** 隔行加上背景色 **/
		$(basicbox).scroll(function(){ /** 當滾動捲軸將固定標題左移 **/
			var basic_xy = $("table", basicbox).position();
			var basic_x = basic_xy.left
			fixedbox.css({"left":basic_x});
		});
	}
	fixedFooter();
}

/** a101_lightbox **/
function a101shopfixedTitle(tableH) {
	var _rootDiv = $(".sstable .fixedTitle "); /** 單純一列的表格 **/
	var basicbox = $(".basictable", _rootDiv);
	if ($("table", basicbox).height() <= tableH) {
		basicbox.css({"height":($("table", basicbox).height() + 1)});
		$("tbody tr:odd",basicbox).addClass("odd"); /** 隔行加上背景色 **/
		return;
	} else {	
		var fixedbox = $("<div/>").prependTo(_rootDiv).addClass("fixed");
		var fixedtable = $("<table/>").prependTo(fixedbox).css({"width":($("table", basicbox).outerWidth())}).attr({border:0,cellpadding:3,cellspacing:0});
		basicbox.css({"height":tableH});
		_rootDiv.css({"width":$(".sstable .fixed table").outerWidth()+17, "height":tableH});
		$("table", _rootDiv).css({"width":$(".sstable .fixed table").outerWidth()});
		basicbox.css({"top":(0 - ($("thead", basicbox).height()+1))}); /** 將原本表格往上提標題的高度(+1是將底線加上；用0減是要變成負數) **/
		fixedtable.append($("thead", basicbox).html()); /** 將原表格內的標題複製一份到fixed裡當成固定時的標題 **/
		for (i=0; i<=$("th",basicbox).length; i++) { /** 將原標題各格的寬度寫入固定標題各格裡(讓固定標題能跟原表格寬度相同) **/
			$("th", fixedtable).eq(i).css({"width":($("th", basicbox).eq(i).width())});
		}
		$("tbody tr:odd",basicbox).addClass("odd"); /** 隔行加上背景色 **/
		$(basicbox).scroll(function(){ /** 當滾動捲軸將固定標題左移 **/
			var basic_xy = $("table", basicbox).position();
			var basic_x = basic_xy.left;
			fixedbox.css({"left":basic_x});
		});
	}	
}

/** function login **/
function login() {
	$(".mainarea").delegate(".rePasswordBtn","click",function(){
		bkArea();
		$(".passwordfile").css({"left":($("html")[0].clientWidth/2)-($(".passwordfile").width()/2),"top":($("html")[0].clientHeight/2)-($(".passwordfile").height()/2)}).show();	
		$(".passwordfile h2, .passwordfile .confirmBtn").delegate("a,button","click",function(){
			$(".passwordfile, .fancybox-overlay").hide();
		});
	});
}

/** function a101 **/
function a101() {
	fixedTitle(362);
	$(".box").delegate(".addBtn, .editiconBtn","click",function(){
		bkArea();
		$(".addfile").css({"left":($("html")[0].clientWidth/2)-($(".addfile").width()/2),"top":($("html")[0].clientHeight/2)-($(".addfile").height()/2)}).show();	
		$(".addfile h2, .addfile .confirmBtn").delegate("a,button","click",function(){
			$(".addfile, .fancybox-overlay").hide();
		});
	});

	var tabTitle = ".addfile .Tabmenu ul li";
	var tabContent = ".checkArea .TabContent .TabContentD";
	$(tabTitle + ":first").addClass("selected");
	$(tabContent).not(":first").hide();
	$(tabTitle).unbind("click").bind("click", function(){
			$(this).siblings("li").removeClass("selected").end().addClass("selected");
			var index = $(tabTitle).index($(this));
			$(tabContent).eq(index).siblings(tabContent).hide().end().show();
			$(".addfile").css({"left":($("html")[0].clientWidth/2)-($(".addfile").width()/2)})/** 點選每個頁籤崇先計算寬度 **/
			a101shopfixedTitle(382);		
	});
	
}

/** function a102 **/
function a102() {
	var tabTitle = ".checkfile .Tabmenu ul li";
	var tabContent = ".checkArea .TabContent .TabContentD";
	$(tabTitle + ":first").addClass("selected");
	$(tabContent).not(":first").hide();
	$(tabTitle).unbind("click").bind("click", function(){
			$(this).siblings("li").removeClass("selected").end().addClass("selected");
			var index = $(tabTitle).index($(this));
			$(tabContent).eq(index).siblings(tabContent).hide().end().show();
	});
	fixedTitle(342);
	$(".box").delegate(".checkBtn","click",function(){
		bkArea();
		$(".checkfile").css({"left":($("html")[0].clientWidth/2)-($(".checkfile").width()/2),"top":($("html")[0].clientHeight/2)-($(".checkfile").height()/2)}).show();
		$(".checkfile h2, .addfile .confirmBtn").delegate("a,button","click",function(){
			$(".checkfile, .fancybox-overlay").hide();
			    if ($(tabTitle).index($(this)) == 1) {
				a102fixedTitle(342);
				return;
			}
		});
	});
}

/** function m10301 **/
function m10301() {
  //左側商品列表展開/收合
  $('.m10301style .content .left .column').click(function () {
    $('.m10301style .content .box.left, .m10301style .content .box.right').toggleClass('close');
  });
  
  //測試鍵盤F2觸發事件
  document.onkeydown = function(event) {
    var e = event || window.event || argument.callee.caller.arguments[0];
    if (e && e.keyCode==113) {
      bkArea();
      $(".m10301CommitBox").show();
    }
  }
  
  //點選審議資料
  $('.m10301style .content .box .column a.showCommit').click(function() {
    bkArea();
    $('.m10301CommitBox').show();
  });
  $('.m10301CommitBox h2 a.closeBtn').click(function() {
    $('.m10301CommitBox').removeAttr('style');
    $('.fancybox-overlay').remove();
  });
  
  //點選憑證及來源資料
  $('.m10301style .content .box .column a.showCertificate').click(function() {
    bkArea();
    $('.m10301CertificateBox').show();
  });
  $('.m10301CertificateBox h2 a.closeBtn').click(function() {
    $('.m10301CertificateBox').removeAttr('style');
    $('.fancybox-overlay').remove();
  });
}

/** function b101 **/
function b101() {
	$(".header .mainmenu ul li").removeClass("selected");
	$(".header .mainmenu ul li").eq(1).addClass("selected");
	$(".header .subnavwrap").hide();
	$(".header .subnavwrap").eq(1).show();
	fixedTitle(342);
	$(".box").delegate(".addBtn, .editiconBtn","click",function(){
		bkArea();
		$(".addfile").css({"left":($("html")[0].clientWidth/2)-($(".addfile").width()/2),"top":($("html")[0].clientHeight/2)-($(".addfile").height()/2)}).show();
		$(".addfile h2, .addfile .confirmBtn").delegate("a,button","click",function(){
			$(".addfile, .fancybox-overlay").hide();
		});
	});	
}

/** function b102 **/
function b102() {
	$(".header .mainmenu ul li").removeClass("selected");
	$(".header .mainmenu ul li").eq(1).addClass("selected");
	$(".header .subnavwrap").hide();
	$(".header .subnavwrap").eq(1).show();
	fixedTitle(342);
	$(".box").delegate(".addBtn, .editiconBtn","click",function(){
		bkArea();
		$(".addfile").css({"left":($("html")[0].clientWidth/2)-($(".addfile").width()/2),"top":($("html")[0].clientHeight/2)-($(".addfile").height()/2)}).show();
		$(".addfile h2, .addfile .confirmBtn").delegate("a,button","click",function(){
			$(".addfile, .fancybox-overlay").hide();
		});
	});	
}

/** function b103 **/
function b103() {
	$(".header .mainmenu ul li").removeClass("selected");
	$(".header .mainmenu ul li").eq(1).addClass("selected");
	$(".header .subnavwrap").hide();
	$(".header .subnavwrap").eq(1).show();
	var tabTitle = ".column .Tabmenu ul li";
	var tabContent = ".content .TabContent .TabContentD";
	var tabContentA = ".content .TabContentA .TabContentD";
	$(tabTitle + ":first").addClass("selected");
	$(tabContent).not(":first").hide();
	$(tabContentA).not(":first").hide();

	$(tabTitle).unbind("click").bind("click", function(){
			$(this).siblings("li").removeClass("selected").end().addClass("selected");
			var index = $(tabTitle).index($(this));
			$(tabContent).eq(index).siblings(tabContent).hide().end().show();
			$(tabContentA).eq(index).siblings(tabContentA).hide().end().show();
	});

	$(".b103style .box .confirmBtn").delegate("button","click",function(){
		$(".b103style .box .inner .answerArea").hide();
	});

	$(".b103style .box .inner .answerArea .discussArea").delegate(".setUpBtn","click",function(){
		$(".b103style .box .inner .answerArea .discussArea li").show();
	});
	
	$(".box").delegate(".searchClientBtn","click",function(){
		bkArea();
		$(".clientfile").css({"left":($("html")[0].clientWidth/2)-($(".clientfile").width()/2),"top":($("html")[0].clientHeight/2)-($(".clientfile").height()/2)}).show();
		b103clientfixedTitle(220);
		$(".clientfile h2, .clientfile ").delegate("a,.checkinBox","click",function(){
			$(".clientfile, .fancybox-overlay").hide();
		});
	});	
}

function pointInfo(){
		var bodyheight = $(document.body).height()+10
		d106bkArea()
		$(".d106fancybox-overlay").css({"height":bodyheight});
		$(".pointAreaTable").css({"margin-top":(0 - ($(".pointAreaTable").height()/2)), "margin-left":(0 - ($(".pointAreaTable").width()/2))}).show();
		document.getElementById("d106Btn").innerHTML="確定";
		$(".pointAreaTable h2, .colorbox .confirmBtn ").delegate(".closebox, button","click",function(){
		$(".pointAreaTable, .d106fancybox-overlay").hide();
		});	
	}
	
function pointInfocheck(){
		var bodyheight = $(document.body).height()+10
		d106bkArea();
		$(".d106fancybox-overlay").css({"height":bodyheight});
		$(".pointAreaTable").show();
		$(".pointAreaTable").css({"margin-top":(0 - ($(".pointAreaTable").height()/2)), "margin-left":(0 - ($(".pointAreaTable").width()/2))})
		document.getElementById("d106Btn").innerHTML="關閉";
		$(".pointAreaTable h2, .colorbox .confirmBtn ").delegate(".closebox, button","click",function(){
		$(".pointAreaTable, .d106fancybox-overlay").hide();
		});	
	}


