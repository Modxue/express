Ext.define('massage.controller.MassageController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.massageController',
	stores : [ 'MassageStore' ],
	models : [ 'MassageModel' ],
	views : [ 'MassageGrid', 'MassageEdit' ],
	init : function() {
		this.control({
			'massageGrid' : {
				itemdblclick : this.editMassage
			},
			'massageEdit button[action=save]' : {
				click : this.updateMassage
			}
		});
	},
	editMassage : function(grid, record) {
		var view = Ext.widget('massageEdit');
		view.down('form').loadRecord(record);
	},
	updateMassage : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
