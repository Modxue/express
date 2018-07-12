Ext.define('massage.model.MassageModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.massageModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'userid',
		type : 'string',
		sortable : true
	}, {
		name : 'username',
		type : 'string',
		sortable : true
	},  {
		name : 'sex',
		type : 'string',
		sortable : true
	},{
		name : 'email',
		type : 'string',
		sortable : true
	},{
		name : 'password',
		type : 'string',
		sortable : true
	},{
		name : 'passage',
		type : 'string',
		sortable : true
	},{
		name : 'satisficing',
		type : 'string',
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