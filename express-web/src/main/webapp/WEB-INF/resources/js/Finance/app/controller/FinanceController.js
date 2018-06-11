Ext.define('finance.controller.FinanceController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.financeController',
	stores : [ 'FinanceStore' ],
	models : [ 'FinanceModel' ],
	views : [ 'FinanceGrid', 'FinanceEdit' ],
	init : function() {
		this.control({
			'financeGrid' : {
				itemdblclick : this.editFinance
			},
			'financeEdit button[action=save]' : {
				click : this.updateFinance
			}
		});
	},
	editFinance : function(grid, record) {
		var view = Ext.widget('financeEdit');
		view.down('form').loadRecord(record);
	},
	updateFinance : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
