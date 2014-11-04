<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="/common/cssinclude.jsp"></jsp:include>



<section id="container" >
  <jsp:include page="/common/header.jsp"></jsp:include>
      
     <jsp:include page="/common/adminmenu.jsp"></jsp:include>
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
      
          <section class="wrapper site-min-height">
          	<div class="row mt">
          	<div class="col-md-12">
          	
          	
          	
          	<div class="form-panel">
          	<h3>Welcome to Department Management</h3>
          	
          	<s:form theme="simple" action="addDept" cssClass="form-horizontal" >
          	
          	<div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">Name</label>
                 <div class="col-sm-10">
                 <s:textfield name="name" value="" cssClass="form-control" placeholder ="Enter Name" ></s:textfield>
                 </div>
            </div>
            
             	<div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">Description</label>
                 <div class="col-sm-10">
                 
                 <s:textarea name="desc" value="" rows="5" cols="10" cssClass="form-control" placeholder ="Enter Description"  ></s:textarea>
                 </div>
            </div>
            
            <div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label"></label>
                 <div class="col-sm-10">
                 
                 <s:submit cssClass="btn btn-primary btn-lg btn-theme" ></s:submit>
                 </div>
            </div>
          	          	
          	
          	</s:form>
          	
          	</div>
          	<br>
           <div class="form-panel">
          	         		
         <table class="table table-striped table-advance table-hover">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <s:iterator value="departmentList"  status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td ><s:property value="id"/></td>
            <td ><s:property value="name"/></td>
            <td ><s:property value="desc"/></td>
            <td ><s:url id="update" action="updateDept">
		       		   <s:param name="department.id" value="id"/>
		       		</s:url> <s:a href="%{update}" cssClass="fa fa-pencil fa-3 " ></s:a>
		       		</td>
		       		<td>
                   <s:url id="delete" action="deleteDept">
                                   <s:param name="department.id" value="id"/>
		       		</s:url> 
		       		<s:a href="%{delete}" cssClass="fa fa-trash-o fa-3 "></s:a>
		       		</td>
        </tr>  		
	 </s:iterator>
    </table>
          		
          		
          		</div>
			
				</div>
			</div>
		</section>
      </section><!-- /MAIN CONTENT -->

<jsp:include page="/common/footer.jsp"></jsp:include>
     
  </section>



<jsp:include page="/common/jssinclude.jsp"></jsp:include>