Ext.define('massage.view.MassageEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.massageEdit',
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
                fieldLabel : '用户账号'
            },  {
				xtype : 'textfield',
				name : 'username',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'sex',
				fieldLabel : '性别'
			},{
				xtype : 'textfield',
				name : 'password',
				fieldLabel : '密码'
			},{
				xtype : 'textfield',
				name : 'satisficing',
				fieldLabel : '满意度'
			},{
				xtype : 'textfield',
				name : 'passage',
				fieldLabel : '留言信息'
			}]
		}];
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
