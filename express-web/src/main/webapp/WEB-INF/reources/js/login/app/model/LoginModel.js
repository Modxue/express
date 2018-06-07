Ext.define('login.model.LoginModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.LoginModel',
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
	},  {
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