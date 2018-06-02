Ext.define('ujournal.model.UJournalModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.ujournalModel',
	fields : [{
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'username',
		type : 'string',
		sortable : true
	}, {
		name : 'email',
		type : 'string',
		sortable : true
	}, {
		name : 'time',
		type : 'string',
		sortable : true
	}, {
		name : 'kind',
		type : 'string',
		sortable : true
	},{
		name : 'express_number',
		type : 'string',
		sortable : true
	}, {
		name : 'express_phone',
		type : 'string',
		dateFormat : 'time',
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