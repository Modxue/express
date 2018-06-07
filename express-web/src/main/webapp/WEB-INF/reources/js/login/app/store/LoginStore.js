var pageSize = 20;

Ext.define('login.store.LoginStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.loginStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'login.model.LoginModel',
	proxy : {
		url : server_context + '/login/.json',
		type : 'ajax',
		api : {
			read : server_context + '/login/.json',
			update : server_context + '/login/.json'
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