Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'userorder',
	appFolder : server_context + '/resources/js/userorder/app',
	controllers : [ 'UserorderController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'userorderGrid'
			} ]
		});
	}
});
