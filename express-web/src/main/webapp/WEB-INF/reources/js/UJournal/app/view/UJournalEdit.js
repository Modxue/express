Ext.define('ujournal.view.UJournalEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.ujournalEdit',
	title : '编辑财务信息',
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
				name : 'username',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'email',
				fieldLabel : '邮箱'
			}, {
				xtype : 'textfield',
				name : 'time',
				fieldLabel : '时间'
			}, {
				xtype : 'textfield',
				name : 'kind',
				fieldLabel : '种类'
			}, {
				xtype : 'textfield',
				name : 'express_number',
				fieldLabel : '快递号码'
			}, {
				xtype : 'textfield',
				name : 'express_phone',
				fieldLabel : '快递电话'
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
