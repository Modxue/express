Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'ujournal',
	appFolder : server_context + '/resources/js/ujournal/app',
	controllers : [ 'UJournalController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'ujournalGrid'
			} ]
		});
	}
});
