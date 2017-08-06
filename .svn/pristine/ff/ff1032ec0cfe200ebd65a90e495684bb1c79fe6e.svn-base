<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
<!--
#dt_basic, #dt_basic th{
	text-align:center;
}
-->
</style>
<section id="widget-grid" class="">
	<!-- row -->
	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-11 col-lg-12">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-darken" id="wid-id-11" data-widget-editbutton="false" data-widget-deletebutton="false"  data-widget-colorbutton="false">
				 
				<header>
					<span class="widget-icon"> <i class="fa fa-table"></i> </span>
					<h2>测试B列表</h2>
				</header>

				<!-- widget div-->
				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div class="widget-body no-padding">
						<div class="widget-body-toolbar">
						   		<!-- 查询：-->
								<a href="#Search"  data-toggle="modal" class="btn btn-labeled  btn-success">
								   <span class="btn-label"><i class="fa fa-search"></i></span> 查询 
								</a> 
							 
								<a href="javascript:void(0);" onclick="javascript:location.href='#testb/add.htmls';" style="margin-left:20px" class="btn btn-labeled btn-primary">
								   <span class="btn-label"><i class="fa fa-plus"></i></span>添加测试B
								</a>
						</div>
						
						<table id="dt_basic" class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>关联TestA主键id</th>
									<th>家庭住址</th>
									<th>联系电话</th>
									<th>年龄</th>
									<th>性别</th>
									<th  style="width:200px;">操 作</th>
								</tr>
							</thead>
							<tbody id="table-row-template" >
													 
							</tbody>
						</table>
						<table style="display:none;" id="tablet">
						 <tbody>
								<tr >
									<td>$userId$</td>
									<td>$address$</td>
									<td>$phoneNum$</td>
									<td>$age$</td>
									<td>$sex$</td>
									<td>
									  <a title="详情" href="#testb/detail.htmls?id=$id$"   class="btn bg-color-green txt-color-white"><i class="glyphicon glyphicon-share"></i></a>
									 &nbsp;
									  <a title="修改" href="#testb/edit.htmls?id=$id$"   class="btn bg-color-magenta txt-color-white"><i class="glyphicon glyphicon-edit"></i></a>
									  &nbsp;
									  <a title="删除"  href="javascript:void(0);" onclick="deleteData('../testb/deleteTestB.htmls',$id$,this)" class="btn btn-default btn-danger"><i class="glyphicon glyphicon-trash"></i> </a>
									</td>
								</tr>			
						 </tbody>
						</table>

					</div>
					<!-- end widget content -->
					<div class="dt-row dt-bottom-row" style="margin: -13px -13px 0;margin-top:1px;">
					    <div class="row">
					     <div class="col-sm-6">
					     	<div class="dataTables_info" id="dt_basic_info">当前显示 0 到0记录，总计0记录</div>
					     </div>
					     <div class="col-sm-6 text-right">
					        <div class="dataTables_paginate paging_bootstrap_full">
					            <ul class="pagination" id="pafination">
					                <li class="first disabled">
					                <a href="#">首页</a></li>
					                <li class="prev disabled"><a href="#">上一页</a></li>
					                <li class="active"><a href="#">0</a></li>
					                <li class="next disabled"><a href="#">下一页</a></li>
					                <li class="last disabled"><a href="#">尾页</a>
					                </li>
					            </ul>
					         </div>
					      </div>
					    </div>
					 </div>
				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->

	</div>
</section>
<!-- end widget grid -->

<!-- 查找信息-->
<div class="modal fade" id="Search" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title">
					测试B查询
				</h4>
			</div>
			<div class="modal-body no-padding">
				<form id="search_form" class="smart-form" >
							<fieldset>
							 <section>
									<div class="row">
										<label class="label col col-3">关联TestA主键id</label>
										<div class="col col-9">
											<label class="input"> <i class="icon-append fa  fa-heart-o"></i>
												<input  type="text"  id="userId" placeholder="关联TestA主键id"/>
											</label>
										</div>
									</div>
								</section> 
							 <section>
									<div class="row">
										<label class="label col col-3">家庭住址</label>
										<div class="col col-9">
											<label class="input"> <i class="icon-append fa  fa-heart-o"></i>
												<input  type="text"  id="address" placeholder="家庭住址"/>
											</label>
										</div>
									</div>
								</section> 
							 <section>
									<div class="row">
										<label class="label col col-3">联系电话</label>
										<div class="col col-9">
											<label class="input"> <i class="icon-append fa  fa-heart-o"></i>
												<input  type="text"  id="phoneNum" placeholder="联系电话"/>
											</label>
										</div>
									</div>
								</section> 
							 <section>
									<div class="row">
										<label class="label col col-3">年龄</label>
										<div class="col col-9">
											<label class="input"> <i class="icon-append fa  fa-heart-o"></i>
												<input  type="text"  id="age" placeholder="年龄"/>
											</label>
										</div>
									</div>
								</section> 
							 <section>
									<div class="row">
										<label class="label col col-3">性别</label>
										<div class="col col-9">
											<label class="input"> <i class="icon-append fa  fa-heart-o"></i>
												<input  type="text"  id="sex" placeholder="性别"/>
											</label>
										</div>
									</div>
								</section> 
								
							</fieldset>
							
							<footer>
								<button type="button" onclick="query(0)" id="" data-dismiss="modal" class="btn btn-primary">
									查询
								</button>
								<button type="button" class="btn btn-default" data-dismiss="modal">
									取消
								</button>
							</footer>
							
						</form>						
			</div>

		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!--查询窗口-->


<script type="text/javascript">
//搜索list	
$(function(){
		
	query(0);
	jQuery("#search_form").validationEngine('attach', {promptPosition : "centerRight", autoPositionUpdate : true});
	
});

//替换模板
function hookContent(){

	var template=[];
	
	template.push({"key":"$id$","value":"id"});
	
	template.push({"key":"$userId$","value":"userId"});
	template.push({"key":"$address$","value":"address"});
	template.push({"key":"$phoneNum$","value":"phoneNum"});
	template.push({"key":"$age$","value":"age"});
	template.push({"key":"$sex$","value":"sex"});
						 
	return template;
}

function query(pageNum){
    var dataForm={};
	
	dataForm.pageSize=10;
	dataForm.pageNum=pageNum;
	
	dataForm.userId=$("#userId").val();
	dataForm.address=$("#address").val();
	dataForm.phoneNum=$("#phoneNum").val();
	dataForm.age=$("#age").val();
	dataForm.sex=$("#sex").val();
	
	switchPage("../testb/findTestBByPage.htmls",hookContent,dataForm,true,false,"","","","");
}
 
//显示标题栏右边的小图标
pageSetUp();	

</script>
