Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'login',
	appFolder : server_context + '/resources/js/login/app',
	controllers : [ 'LoginController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'LoginGrid'
			} ]
		});
	}
});
