var pageSize = 20;

Ext.define('myFinance.store.MyFinanceStore', {
    extend : 'Ext.data.Store',
    alias : 'widget.myFinanceStore',
    autoLoad : true,
    autoSync : true,// 需要同步
    model : 'myFinance.model.MyFinanceModel',
    proxy : {
        url : server_context + '/zouguo/myFinance/.json',
        type : 'ajax',
        api : {
            read : server_context + '/zouguo/myFinance/.json',
            update : server_context + '/zouguo/myFinance/.json'
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