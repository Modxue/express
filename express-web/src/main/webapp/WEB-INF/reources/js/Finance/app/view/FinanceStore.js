var pageSize = 20;

Ext.define('finance.store.FinanceStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.financeStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'finance.model.FinanceModel',
	proxy : {
		url : server_context + '/finance/.json',
		type : 'ajax',
		api : {
			read : server_context + '/finance/.json',
			update : server_context + '/finance/.json'
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