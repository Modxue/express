Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'finance',
	appFolder : server_context + '/resources/js/finance/app',
	controllers : [ 'FinanceController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'financeGrid'
			} ]
		});
	}
});
