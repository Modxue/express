var pageSize = 20;

var studentStore = Ext.create('pay.store.PayStore');

Ext.define('pay.view.PayStore', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.payGrid',
	title : 'Express - 支付信息表',
	store : payStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	},  {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'user_name'
	}, {
		text : "用户支付费用",
		width : 80,
		sortable : true,
		dataIndex : 'user_money'
	}, {
		text : "收取费用",
		width : 80,
		sortable : true,
		dataIndex : 'manager_money'
	},  {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : payStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
