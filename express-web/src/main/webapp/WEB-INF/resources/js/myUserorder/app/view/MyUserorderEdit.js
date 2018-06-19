Ext.define('myUserorder.view.MyUserorderEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.myUserorderEdit',
	title : '编辑订单信息',
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
                name : 'id',
                fieldLabel : 'ID'
            },{
				xtype : 'textfield',
				name : 'time',
				fieldLabel : '时间'
			}, {
				xtype : 'textfield',
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'kind',
				fieldLabel : '类别'
			}, {
				xtype : 'textfield',
				name : 'expnum',
				fieldLabel : '单号'
			}, {
				xtype : 'textfield',
				name : 'email',
				fieldLabel : '电子邮件'
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
