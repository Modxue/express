var pageSize = 20;

Ext.define('pay.store.PayStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.payStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'pay.model.PayModel',
	proxy : {
		url : server_context + '/pay/.json',
		type : 'ajax',
		api : {
			read : server_context + '/pay/.json',
			update : server_context + '/pay/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});