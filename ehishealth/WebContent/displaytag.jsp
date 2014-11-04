<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<jsp:include page="/common/cssinclude.jsp"></jsp:include>
 
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
 
 
<table  class="table table-striped table-advance table-hover">
    <tr>
        <th><s:text name="label.firstName"/></th>
        <th><s:text name="label.lastName"/></th>
        <th><s:text name="label.age"/></th>
        <th><s:text name="label.department"/></th>
        <th> </th>
    </tr>
    <s:iterator value="employees" status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="employeeCode"/></td>
            <td class="nowrap"><s:property value="employeeName"/></td>
            <td class="nowrap"><s:url id="update" action="setUpForInsertOrUpdate">
		       		   <s:param name="employee.employeeId" value="employeeId"/>
		       		</s:url> <s:a href="%{update}">Edit</s:a>
                   
                                <s:url id="delete" action="delete">
                                   <s:param name="employee.employeeId" value="employeeId"/>
		       		</s:url> <s:a href="%{delete}">Delete</s:a>
            </td>
        </tr>  		
	 </s:iterator>
    </table>