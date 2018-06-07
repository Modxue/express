Ext.define('pay.model.PayModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.payModel',
	fields : [  {
		name : 'user_name',
		type : 'string',
		sortable : true
	}, {
		name : 'user_money',
		type : 'int',
		sortable : true
	},{
		name : 'manager_money',
		type : 'int',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});