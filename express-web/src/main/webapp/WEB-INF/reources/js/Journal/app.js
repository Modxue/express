Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'journal',
	appFolder : server_context + '/resources/js/journal/app',
	controllers : [ 'JournalController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'journalGrid'
			} ]
		});
	}
});
