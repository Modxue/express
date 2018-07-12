Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'massage',
	appFolder : server_context + '/resources/js/massage/app',
	controllers : [ 'MassageController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'massageGrid'
			} ]
		});
	}
});
