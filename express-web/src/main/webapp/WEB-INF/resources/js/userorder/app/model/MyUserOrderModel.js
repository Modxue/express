Ext.define('userorder.model.MyUserOrderModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.myUserOrderModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'time',
		type : 'string',
		sortable : true
	},{
		name : 'name',
		type : 'string',
		sortable : true
	},  {
		name : 'kind',
		type : 'string',
		sortable : true
	}, {
		name : 'expnum',
		type : 'string',
		sortable : true
	}, {
		name : 'email',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}]
});