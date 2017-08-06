/**
 * 上传图片
 * @param btn
 * @param url
 * @param input_obj
 * @param path_image_obj
 */
function g_AjxUploadFile(btn,url,input_obj,path_image_obj) {
var button = btn;
var img = $(input_obj).val();
 new AjaxUpload(button, {
	    action: url,
	    data:{},
	    name: 'myfile',
	    onSubmit: function(file, ext) {
		   this.setData( {"imgpath":$(input_obj).val()});
	    },
	    onComplete: function(file, response) {
		        if(response!="failed"){
		        	response=response.replace("\"","").replace("\"","");
					$(input_obj).val(response);
					$(path_image_obj).attr("src","../file/img/"+response);
		        	
		        	$.smallBox({
						title : "消息",
						content : "<i class='fa fa-clock-o'></i> <i>上传成功！</i>",
						color : "#659265",
						iconSmall : "fa fa-check fa-2x fadeInRight animated",
						timeout :2000
					});
		        }else{
		        	$.smallBox({
						title : "消息",
						content : "<i class='fa fa-clock-o'></i> <i>上传失败！</i>",
						color : "#c7254e",
						iconSmall : "fa fa-times fa-2x fadeInRight animated",
						timeout : 2000
					});
		        }
	    }
	});
}

/**
 * 格式化时间
 * @param nS
 * @returns
 */
function getLocalTime(nS) {
	if(nS!=null){
	 var date=  new Date(parseInt(nS) *1).toLocaleString().replace(/:\d{1,2}$/,' ');     
	 var str= (date+"").replace("年","-").replace("月","-").replace("日","").replace("/","-").replace("/","-");
	 var index=str.indexOf(" ");
	 return str.substring(0,index) ;
	}else{
		return "";
	}
}


/**
 * 异常处理
 * @param response
 */
function error(response){
	console.log(response.status);
	var message="未知错误";
	if(response.status=="404"){
		message="请求资源不存在";
	}else if(response.status=="400"){
		message="请求数据异常";
	}else if(response.status=="405"){
		message="请求数据方法不正确";
	}else if(response.status=="415"){
		message="请求数据格式不正确";
	}else if(response.status=="500"){
		message="服务器处理异常";
	}
	
	$.smallBox({
		title : "消息",
		content : "<i class='fa fa-clock-o'></i> <i>"+message+"</i>",
		color : "#c7254e",
		iconSmall : "fa fa-times fa-2x fadeInRight animated",
		timeout : 4000
	});
	
}


/*
*
*参数说明 
*url获取数据地址，
*target_id显示数据目标标签id,
*obj将本调用对象传进去
*
*/
function getDataAjaxByParam(url,target_id,_param,_selected,_contentType,is_asy){
	var param=_param;
	
	if(!is_asy){
		is_asy=false;
	}
	 
	$.ajax({
		url : url,
		type : 'POST',
		data :param,
		dataType:"json",
		async:is_asy,
		contentType:_contentType,
		success : function(data) {
			var html="<option value='' selected='selected'>请选择</option>";
			if(data.result.list.length>0){
				var result = data.result.list;
				
				for(var i=0;i<result.length;i++){
					if(_selected==result[i].id&&_selected!=""){
						html+="<option  selected value="+result[i].id+">"+result[i].name+"</option>";
					}else{
						html+="<option  value="+result[i].id+">"+result[i].name+"</option>";
					}
				}
			}
//			/alert("#"+target_id);
			$("#"+target_id).html(html);
		}
	}); 
	 
}

var success_count=0;
var error_count=0;
function ajax(_url,_type,_data,_dataType,_contentType,_success,_error){
	$.ajax({
		url:_url,
		type:_type,
		data:_data,
		dataType:_dataType,
		contentType:_contentType,
		success:function(data){ success1(data);},
		error:function(data){error1(data);}
	});
}
 
/**
 * 获得URL中的参数
 * @param name  参数名
 * @returns
 */
function getParamForUri(name) {
	var uri = window.location.toString();
	var parm = uri.substring(uri.indexOf("?") + 1);
	var list = parm.split("&");
	for ( var i = 0; i < list.length; i++) {
		var p1 = list[i].split("=")[0];
		var p2 = list[i].split("=")[1];

		if (name == p1) {
			return p2;
		}
	}
	return null;
};


/**
 * 显示面包条  
 * @param data 例如 主页,信息1,信息2
 */
function showribbon(data){
	var lilist  = data.split(",");
	var html =""
	for(var i = 0 ; i<lilist.length; i++){
		html += "<li>"+lilist[i]+"</li>";
	}
	
	$("#ribbon ol").html("主页  / "+html);
}



//翻页地址
var _url;

//回调函数替换模板
var _hookFun;

//当前页数
var _pageNum;

//页面容量
var _pageSize;

//历史查询条件
var _historyParam;

//替换表单内容
function replaceTable(obj, tag, value) {

	var tmpStr = obj;

	while (tmpStr.indexOf(tag) > -1) {
		if (value == null) {
			value = "无";
		}
		tmpStr = tmpStr.replace(tag, value);
	}

	return (tmpStr);

}

//获得目标值

function getChildValue(obj, path) {

	var flag = path.indexOf(".");

	if (flag == 0)
		return "";

	if (flag > -1) {

		return getChildValue(obj[path.substring(0, flag)], path
				.substr(flag + 1));

	} else {

		return obj[path];
	}

}

/**
 * 删除数据
 * @param url
 * @param id 根据编号
 * @param obj
 */
function deleteData(url, id, obj) {

	$
			.SmartMessageBox(
					{
						title : "信息提示!",
						content : "你确认要删除该条数据么？",
						buttons : '[取消][删除]'
					},
					function(ButtonPressed) {
						if (ButtonPressed === "删除") {
							$
									.ajax({
										url : url,
										type : 'POST',
										data : "id=" + id,
										dataType:"json",
										success : function(result) {
											 
											if ((result.result+"") == 'true') {
												$
														.smallBox({
															title : "消息",
															content : "<i class='fa fa-clock-o'></i> <i>删除成功！</i>",
															color : "#659265",
															iconSmall : "fa fa-check fa-2x fadeInRight animated",
															timeout : 4000
														});

												window.setTimeout(function() {
													location.reload();
												}, 1000);
											} else {
												$
														.smallBox({
															title : "消息",
															content : "<i class='fa fa-clock-o'></i> <i>删除失败！</i>",
															color : "#c7254e",
															iconSmall : "fa fa-times fa-2x fadeInRight animated",
															timeout : 4000
														});
											}
										}
									});
						}
					});

}

function recoverData(url, id, obj) {

	$
			.SmartMessageBox(
					{
						title : "信息提示!",
						content : "你确认要还原？",
						buttons : '[取消][还原]'
					},
					function(ButtonPressed) {
						if (ButtonPressed === "还原") {
							$
									.ajax({
										url : url,
										type : 'POST',
										data : "id=" + id,
										dataType:"json",
										success : function(result) {
											 
											if ((result.result+"") == 'true') {
												$
														.smallBox({
															title : "消息",
															content : "<i class='fa fa-clock-o'></i> <i>还原成功！</i>",
															color : "#659265",
															iconSmall : "fa fa-check fa-2x fadeInRight animated",
															timeout : 4000
														});

												window.setTimeout(function() {
													location.reload();
												}, 1000);
											} else {
												$
														.smallBox({
															title : "消息",
															content : "<i class='fa fa-clock-o'></i> <i>还原失败！</i>",
															color : "#c7254e",
															iconSmall : "fa fa-times fa-2x fadeInRight animated",
															timeout : 4000
														});
											}
										}
									});
						}
					});

}
/**
 * 设置翻页信息
 * @param pageNum
 * @param pageSize
 * @param url
 * @param handler
 * @param params
 * @param is_page  true需要分页   false调用控件分页
 * @param _htmlTempNo 表格模版id
 * @param _htmlRowTempNo  行模版id
 * @param is_query  true是第一次查询   false不是第一次查询  此情况针对 调用控件分也使用
 * _pageHtmlNo  分页编号id
 * _pageInfoShowNo 分页信息显示编号id
 */
function switchPage( url, handler, params, is_page,is_query,_htmlTempNo,_htmlRowTempNo,_pageHtmlNo,_pageInfoShowNo) {

	if (url != undefined) {
		_url = url;
	}
	if (handler != undefined) {
		_hookFun = handler;
	}
	 
	if(_htmlTempNo==""){
		_htmlTempNo="tablet";
	}
	
	if(_htmlRowTempNo==""){
		_htmlRowTempNo="table-row-template";
	}
	
	if(_pageHtmlNo==""){
		_pageHtmlNo="pafination";
	}
	
	if(_pageInfoShowNo==""){
		_pageInfoShowNo="dt_basic_info";
	}

	var dataForm = params;

	$.ajax({
				url : _url,
				type : 'POST',
				data : JSON.stringify(dataForm),
				dataType : 'json',
				contentType:'application/json;charset=UTF-8',
				success : function(data) {
				 
					var result=data.result;
					
					if (result.list.length > 0) {
						var html = "";
						 
						//进行分页操作
						if(is_page){
							getPage(result.total,result.pageNum,result.pageSize,_pageHtmlNo,_pageInfoShowNo);
						}
						
						//进行赋值操作
						for ( var li in result.list) {

							var htmlTemplate = "";
							 
							htmlTemplate=$("#"+_htmlTempNo+" tbody").html();
							 

							var list = _hookFun();

							for ( var tmp in list) {

								var key = list[tmp]["key"];

								var value = list[tmp]["value"];

								var translate = list[tmp]["translate"];

								var realvalue = null;

								if (translate == undefined) {

									realvalue = getChildValue(result.list[li],
											value);

								} else {

									realvalue = translate(getChildValue(
											result.list[li], value),
											result.list[li]);

								}

								htmlTemplate = replaceTable(htmlTemplate, key,
										realvalue);

							}
							html += htmlTemplate;
						 
						}

						$('#'+_htmlRowTempNo).html(html);

					} else {
						$('#'+_htmlRowTempNo).html('<tr class="odd"><td valign="top" colspan="12" class="dataTables_empty">暂时没有数据</td></tr>');
						 
						if(is_page){
							getPage(0,0,1,_pageHtmlNo,_pageInfoShowNo);
						}
					}

					if (!is_page&&is_query) {
						 loadDataTableScripts(_htmlTempNo);
					}
				}

		});

}


function loadDataTableScripts(_htmlTempNo) {

	 runDataTables(_htmlTempNo);

}

function runDataTables(_htmlTempNo) {

	/* Add the events etc before DataTables hides a column */
	$("#"+_htmlTempNo+" thead input").keyup(function() {
		oTable.fnFilter(this.value, oTable.oApi._fnVisibleToColumnIndex(oTable.fnSettings(), $("thead input").index(this)));
	});

	$("#"+_htmlTempNo+" thead input").each(function(i) {
		this.initVal = this.value;
	});
	$("#"+_htmlTempNo+" thead input").focus(function() {
		if (this.className == "search_init") {
			this.className = "";
			this.value = "";
		}
	});
	$("#"+_htmlTempNo+" thead input").blur(function(i) {
		if (this.value == "") {
			this.className = "search_init";
			this.value = this.initVal;
		}
	});		
	

	var oTable = $('#'+_htmlTempNo).dataTable({
		"sDom" : "<'dt-top-row'><'dt-wrapper't><'dt-row dt-bottom-row'<'row'<'col-sm-6'i><'col-sm-6 text-right'p>>",
		//"sDom" : "t<'row dt-wrapper'<'col-sm-6'i><'dt-row dt-bottom-row'<'row'<'col-sm-6'i><'col-sm-6 text-right'>>",
		"oLanguage" : {
			"sSearch" : "查找所有的列:"
		},
		"bSortCellsTop" : true
	});	
 
}

function getPage(total,num,size,_pageHtmlNo,_pageInfoShowNo){
	/**
	 * <li class="first disabled">
     <a href="#">首页</a></li>
     <li class="prev disabled"><a href="#">上一页</a></li>
     <li class="active"><a href="#">1</a></li>
     <li class=""><a href="#">2</a></li>
     <li class=""><a href="#">3</a></li>
     <li class="next disabled"><a href="#">下一页</a></li>
     <li class="last disabled"><a href="#">尾页</a>
     </li>
	 * 
	 **/

	//总计多少页
	var page=Math.ceil(total/size);
	//是否显示
	var prev_is_enable="";
	var next_is_enable="";
	 
	if(page<=1){
		next_is_enable="disabled";
		prev_is_enable="disabled";
	}
	
	if(num==0||total==0){
		prev_is_enable="disabled";
	}else{
		prev_is_enable="";
	}
	//是否显示
	if(num==(page-1)||total==0){
		next_is_enable="disabled";
	}else{
		next_is_enable="";
	}
	
	var active="";
	
	var html="<li class=\"first "+prev_is_enable+"\"><a href=\"javascript:query('0')\">首页</a></li>";
	
	if(page<=1||num==0){
		html+=" <li class=\"prev "+prev_is_enable+"\"><a href=\"javascript:void();\">上一页</a></li>";
	}else{
		html+=" <li class=\"prev "+prev_is_enable+"\"><a href=\"javascript:query('"+(num-1)+"')\">上一页</a></li>";
	}
	
	var is_page=parseInt(num/4);
	 
	var dd=parseInt(num%8);
	if(dd<=2&&is_page>0){
		is_page=is_page-1;
	}
	 
	/*if(dd>=7&&num>4*is_page&&is_page>0){
		is_page=is_page+1;
	}*/
	 
	var value=(is_page*4>num)?num:is_page*4;
	
	for(var i=value;i<value+8&&i<page;i++){
		if(i==num){
			active="active";
		}else{
			active="";
		}
		html+=" <li class=\""+active+"\"><a href=\"javascript:query('"+i+"')\">"+(i+1)+"</a></li>";
	}
	
	if(page<=1||num==(page-1)){
		html+="<li class=\"next "+next_is_enable+"\"><a href=\"javascript:void(0);\">下一页</a></li>"+
		"<li class=\"last "+next_is_enable+"\"><a href=\"javascript:void(0);\">尾页</a> </li>";
	}else{
		html+="<li class=\"next "+next_is_enable+"\"><a href=\"javascript:query('"+(num+1)+"')\">下一页</a></li>"+
		"<li class=\"last "+next_is_enable+"\"><a href=\"javascript:query('"+(page-1)+"')\">尾页</a> </li>";
	}
   
	$("#"+_pageHtmlNo).html(html);	
	 
	
	var pagenum=size+num*size;
	 
	pagenum=pagenum>total?total:pagenum;
	
	if(total==0){
		 
		$("#"+_pageInfoShowNo).html("当前显示0到 0记录，总计0记录");
		 
	}else{
		 
		$("#"+_pageInfoShowNo).html("当前显示 "+(num*size+1)+" 到 "+pagenum+"记录，总计"+total+"记录");
		 
	}
	
}

function callback(){
	var result='{"status":"0","msg":"","action":"callReturn"}';
	callapp(result);
}
function callhome(){
	var result='{"status":"0","msg":"","action":"callHome"}';
	callapp(result);
}

function callapp(result){
	
	$.PI_js2app.js2app(result);
	
}

function toastmodel(val){
	
	var content='{"content":"'+val+'"}';
	$.PI_js2app.js2app('{"status":"0","msg":"","action":"callToast","toastData":'+content+'}');
	
}

function refresh(){
	location.replace(location.href);
}


function openlink(link){
	
	location.href=link;
	
}
