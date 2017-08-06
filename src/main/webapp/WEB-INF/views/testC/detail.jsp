<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<!-- 面板 -->
	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

			<div class="jarviswidget jarviswidget-color-darken" id="wid-id-6"
			data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false" data-widget-sortable="false" data-widget-deletebutton="false"  >

				<header>
					<h2>
						<strong><i class="fa fa-th-large"></i>&nbsp;查看测试C</strong>
					</h2>
				</header>

				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div class="widget-body">
						<form id="add-form" class="smart-form">

							<fieldset>
								<section>
									<div class="row">
										<label class="label col col-2">标记</label>
										<div class="col col-8">
											<label class="input"> <i class="icon-append fa fa-user"></i>
												<input type="text" disabled="disabled" placeholder="标记" id="flag" class="validate[required,custom[chineseandenglish],maxSize[100]]" >
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">金额</label>
										<div class="col col-8">
											<label class="input"> <i class="icon-append fa fa-user"></i>
												<input type="text" disabled="disabled" placeholder="金额" id="money" class="validate[required,custom[chineseandenglish],maxSize[100]]" >
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">客户姓名</label>
										<div class="col col-8">
											<label class="input"> <i class="icon-append fa fa-user"></i>
												<input type="text" disabled="disabled" placeholder="客户姓名" id="customerName" class="validate[required,custom[chineseandenglish],maxSize[100]]" >
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">银行账号</label>
										<div class="col col-8">
											<label class="input"> <i class="icon-append fa fa-user"></i>
												<input type="text" disabled="disabled" placeholder="银行账号" id="bankAccount" class="validate[required,custom[chineseandenglish],maxSize[100]]" >
											</label>
										</div>
									</div>
								</section>
							</fieldset>
							
						</form>	
					</div>
				</div>
			</div>
		</article>

	</div>

	<!-- row -->
	<div class="row">

		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-darken" id="wid-id-5"
			data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false" data-widget-sortable="false" data-widget-deletebutton="false"  >

				<header>
					<span class="widget-icon"> <i class="fa fa-pencil-square-o"></i>
					</span>
					<h2>操作列表</h2>
				</header>

				<!-- widget div-->
				<div>
					<div class="widget-body">
						<form id="form1" class="smart-form" novalidate="novalidate">
							<footer>
								  <a class="btn btn bg-color-pink txt-color-white"
									style="float: left;" onclick="back();"><i
									class="fa fa-mail-reply"></i> 返回列表 </a>
							</footer>
						</form>
					</div>
				</div>
			</div>
		</article>
	</div>
<!-- end widget grid -->

<script type="text/javascript">
 	var i = 1;
 	var id=-1;
	$(function() {
		//必须写	
		id=getParamForUri("id");
		pageSetUp();
		showribbon("测试C管理,查看测试C");
		
		loadFormInfo();
		
	});
	function loadFormInfo(){
		var p={};
		p.id=id;
		ajax("testc/findTestCById.htmls","post",JSON.stringify(p), "json","application/json",success1,error1);
	}
	
 var success1=function(data){
		if(data!=null){
			var rs=data.result;
			$("#flag").val(rs.flag);
			$("#money").val(rs.money);
			$("#customerName").val(rs.customerName);
			$("#bankAccount").val(rs.bankAccount);
			ue.addListener("ready", function () {
				// editor准备好之后才可以使用
				ue.setContent(rs.attachment);
			});
		}
	}
	
	var error1=function(response){
		error(response);
	}
	
	
	function back() {
		location.href = "#testc/index.htmls";
	}
	 
</script>

