Ext.define('login.view.LoginEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.LoginEdit',
	title : '编辑用戶信息',
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
				name : 'userid',
				fieldLabel : '用戶賬號'
			}, {
				xtype : 'textfield',
				name : 'username',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'sex',
				fieldLabel : '性别'
			},   
		  ];
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
