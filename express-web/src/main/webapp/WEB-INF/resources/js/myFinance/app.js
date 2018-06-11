Ext.Loader.setConfig({
    enabled : true
});
Ext.application({
    name : 'myFinance',
    appFolder : server_context + '/resources/js/myFinance/app',
    controllers : [ 'MyFinanceController' ],
    launch : function() {
        Ext.create('Ext.container.Viewport', {
            layout : 'fit',
            items : [ {
                xtype : 'myFinanceGrid'
            } ]
        });
    }
});