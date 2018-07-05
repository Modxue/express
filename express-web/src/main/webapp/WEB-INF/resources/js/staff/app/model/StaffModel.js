Ext.define('staff.model.StaffModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.staffModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'idnum',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'age',
		type : 'int',
		sortable : true
	}, {
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