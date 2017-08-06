<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<!-- 面板 -->
	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

			<div class="jarviswidget jarviswidget-color-darken" id="wid-id-4"
			data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false" data-widget-sortable="false" data-widget-deletebutton="false"  >

				<header>
					<h2>
						<strong><i class="fa fa-th-large"></i>&nbsp;编辑测试B</strong>
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
										<label class="label col col-2">关联TestA主键id</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="关联TestA主键id" id="userId"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">家庭住址</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="家庭住址" id="address"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">联系电话</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="联系电话" id="phoneNum"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">年龄</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="年龄" id="age"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">性别</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="性别" id="sex"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">所在省</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="所在省" id="province"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">所在市</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="所在市" id="city"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">所在县</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="所在县" id="country"
												class="validate[required,maxSize[100]]">
											</label>
										</div>
									</div>
								</section>
								<section>
									<div class="row">
										<label class="label col col-2">删除标记位</label>
										<div class="col col-8">
											<label class="input"> <i
												class="icon-append fa fa-user"></i> <input type="text"
												placeholder="删除标记位" id="flag"
												class="validate[required,maxSize[100]]">
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
								<a class="btn btn-success" onclick="saveForm(this);"
									style="float: left;"><i class="fa fa-check"></i> 保存信息 </a> <a
									class="btn btn bg-color-pink txt-color-white"
									style="float: left;" onclick="back();"><i
									class="fa fa-mail-reply"></i> 返回列表 </a>
							</footer>
						</form>
					</div>
				</div>
			</div>
		</article>
	</div>


</section>
<!-- end widget grid -->

<script type="text/javascript">
 
 
 	var  id=-1;
 	
	$(function() {
		//必须写	
		pageSetUp();
		showribbon("测试B管理,编辑测试B");
		jQuery("#add-form").validationEngine('attach', {promptPosition : "centerRight", autoPositionUpdate : true});
		
		id=getParamForUri("id");
		loadFormInfo();
		
	});
	
	var success1=function(data){
		if(data!=null){
			var rs=data.result;
			$("#userId").val(rs.userId);
			$("#address").val(rs.address);
			$("#phoneNum").val(rs.phoneNum);
			$("#age").val(rs.age);
			$("#sex").val(rs.sex);
			$("#province").val(rs.province);
			$("#city").val(rs.city);
			$("#country").val(rs.country);
			$("#flag").val(rs.flag);
		}
	}
	
	var error1=function(response){
		error(response);
	}
	
	function loadFormInfo(){
		var p={};
		
		p.id=id;
		ajax("testb/findTestBById.htmls","post",JSON.stringify(p), "json","application/json",success1,error1);
	}
	
	

	//保存表单
	function saveForm(obj) {
		//验证信息提示
		var flag1=$("#add-form").validationEngine('validate');
		if(flag1){
			
			$(obj).attr("disabled","disabled");
			
			var dataForm={};
			//基本信息
			
				dataForm.userId = $("#userId").val();
			    dataForm.id=id;
				dataForm.address = $("#address").val();
				dataForm.phoneNum = $("#phoneNum").val();
				dataForm.age = $("#age").val();
				dataForm.sex = $("#sex").val();
				dataForm.province = $("#province").val();
				dataForm.city = $("#city").val();
				dataForm.country = $("#country").val();
				dataForm.flag = $("#flag").val();
			
			$.ajax({
				url: 'testb/editTestB.htmls',
				type: 'POST', 
		        data: JSON.stringify(dataForm), 
		        dataType:"json",
		        contentType:'application/json;charset=UTF-8',        
		        success: function(data) {
		        	if(data.result+""=="true"){
		        		$.smallBox({
							title : "消息",
							content : "<i class='fa fa-clock-o'></i> <i>更新成功,更新框即将关闭！</i>",
							color : "#659265",
							iconSmall : "fa fa-times fa-2x fadeInRight animated",
							timeout : 4000
						});
		        		window.setTimeout(function(){location.href="#testb/index.htmls";},1000);
		        	}else{
		        		$.smallBox({
							title : "消息",
							content : "<i class='fa fa-clock-o'></i> <i>更新失败，请稍后重试！</i>",
							color : "#c7254e",
							iconSmall : "fa fa-times fa-2x fadeInRight animated",
							timeout : 4000
						});
		        		$(obj).removeAttr("disabled");
		        	}
		        },
		        error:function(response){
		        	error(response);
		        	$(obj).removeAttr("disabled");
		        }			
			});
		}
		
	}

	//返回列表
	function back() {
		location.href = "#testb/index.htmls";
	}
	 
</script>