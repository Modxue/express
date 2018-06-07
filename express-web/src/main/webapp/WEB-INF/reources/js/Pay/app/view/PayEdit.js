Ext.define('pay.view.PayEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.payEdit',
	title : '编辑支付信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'idnum',
				fieldLabel : '工号'
			}, {
				xtype : 'textfield',
				name : 'username',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'usermoney',
				fieldLabel : '钱'
			}, {
				xtype : 'textfield',
				name : 'managermoney',
				fieldLabel : '钱'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
