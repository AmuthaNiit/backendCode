$(document).ready( function () {
	 var table = $('#categoryTable').DataTable({
			"sAjaxSource": "categorys",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      { "mData": "categoryname" },
		      /*,
				  { "mData": "categoryId" },
				  { "mData": "categoryname" },*/
				 
			]
	 });
	 
	 var table = $('#supplierTable').DataTable({
			"sAjaxSource": "suppliers",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "supplierId"},
		      { "mData": "suppliername" }
		     
		      /*,
				  { "mData": "categoryId" },
				  { "mData": "categoryname" },*/
				 
			]
	 })
});