var pageSize = 20;

Ext.define('massage.store.MassageStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.massageStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'massage.model.MassageModel',
	proxy : {
		url : server_context + '/houjie/massage/.json',
		type : 'ajax',
		api : {
			read : server_context + '/houjie/massage/.json',
			update : server_context + '/houjie/massage/.json'
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