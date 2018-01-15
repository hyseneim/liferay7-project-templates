<%@ include file="/init.jsp" %>
																																																																																																																																																				
<!-- Temporary workaround to obtain the library stylesheets -->
<link href="/o/my-npm-billboardjs-portlet/node_modules/billboard.js@1.1.1/dist/billboard.css" rel="stylesheet">

<div id="<portlet:namespace />"></div>

<aui:script require="my-npm-billboardjs-portlet@1.0.0">
	myNpmBillboardjsPortlet100.default('<portlet:namespace />');
</aui:script>