Ext.define('myFinance.controller.MyFinanceController', {
    extend : 'Ext.app.Controller',
    alias : 'widget.myFinanceController',
    stores : [ 'MyFinanceStore' ],
    models : [ 'MyFinanceModel' ],
    views : [ 'MyFinanceGrid', 'MyFinanceEdit' ],
    init : function() {
        this.control({
            'myFinanceGrid' : {
                itemdblclick : this.editMyFinance
            },
            'myFinanceEdit button[action=save]' : {
                click : this.updateMyFinance
            }
        });
    },
    editMyFinance : function(grid, record) {
        var view = Ext.widget('myFinanceEdit');
        view.down('form').loadRecord(record);
    },
    updateMyFinance : function(button) {
        var win = button.up('window');
        form = win.down('form');
        record = form.getRecord();
        values = form.getValues();
        record.set(values);
        win.close();
    }
});
