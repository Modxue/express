Ext.define('myFinance.model.MyFinanceModel', {
    extend : 'Ext.data.Model',
    alias : 'widget.myFinanceModel',
    fields : [ {
        name : 'id',
        type : 'int',
        sortable : true
    }, {
        name : 'name',
        type : 'string',
        sortable : true
    }, {
        name : 'sex',
        type : 'string',
        sortable : true
    }, {
        name : 'age',
        type : 'int',
        sortable : true
    }, {
        name : 'balance',
        type : 'double',
        sortable : true
    }, {
        name : 'dateCreated',
        type : 'date',
        dateFormat : 'time',
        sortable : true
    }, {
        name : 'dateModified',
        type : 'date',
        dateFormat : 'time',
        sortable : true
    } ]
});