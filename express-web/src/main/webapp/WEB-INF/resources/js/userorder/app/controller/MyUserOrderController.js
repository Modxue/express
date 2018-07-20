Ext.define('userorder.controller.MyUserOrderController', {
    extend : 'Ext.app.Controller',
    alias : 'widget.myUserOrderController',
    stores : [ 'MyUserOrderStore' ],
    models : [ 'MyUserOrderModel' ],
    views : [ 'MyUserOrderGrid', 'MyUserOrderEdit' ],
    init : function() {
        this.control({
            'myUserOrderGrid' : {
                itemdblclick : this.editUserOrder
            },
            'myUserOrderEdit button[action=save]' : {
                click : this.updateUserOrder
            }
        });
    },
    editUserOrder : function(grid, record) {
        var view = Ext.widget('myUserOrderEdit');
        view.down('form').loadRecord(record);
    },
    updateUserOrder : function(button) {
        var win = button.up('window');
        form = win.down('form');
        record = form.getRecord();
        values = form.getValues();
        record.set(values);
        win.close();
    }
});
