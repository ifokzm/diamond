define(['jquery', 'bootstrap', 'backend', 'table', 'form'], function ($, undefined, Backend, Table, Form) {

    var Controller = {
        index: function () {
            // 初始化表格参数配置
            Table.api.init({
                extend: {
                    index_url: 'api/rooms/getPage',
                    add_url: 'page-edit.html',
                    edit_url: 'page-edit.html',
                    del_url: 'data/del.json',
                    multi_url: 'data/multi.json',
                    table: 'page',
                }
            });

            var table = $("#table");

            // 初始化表格
            table.bootstrapTable({
                url: $.fn.bootstrapTable.defaults.extend.index_url,
                sortName: 'weigh',
                columns: [
                    [
                        {field: 'state', checkbox: true},
                        {field: 'id', title: __('Id'), operate: false},
                        {field: 'projectId', title: '项目编号', operate: '=', sortable: true},
                        {field: 'projectName', title: '项目名称', operate: '='},
                        {field: 'buildingId', title: '幢号', operate: 'LIKE %...%', placeholder: '关键字，模糊搜索'},
                        {field: 'buildingName', title: '幢名称',  operate: false},
                        {field: 'roomId', title: '户编号',  operate: false},
                        {field: 'roomName', title: '户名', operate: false},
                        {field: 'roomStatus', title: '销售状态', operate: false},
                        {field: 'roomBuildArea', title: '建筑面积', operate: false},
                        {field: 'roomShareArea', title: '公摊面积' },
                        {field: 'roomInsideArea', title: '内部面积' },
                        {field: 'roomFloor', title: '所在层' },
                        {field: 'roomStructure', title: '建筑结构' },
                        {field: 'roomRefPrice', title: '参考价' },
                        {field: 'roomTotalPrice', title: '参考总价' },
                        {field: 'unitName', title: '单元号' },
                        {field: 'roomLocation', title: '位置' },
                        {field: 'roomRelocation', title: '大类划分' },
                        {field: 'transDate', title: '交易日期' },
                        {field: 'transavgPrice', title: '交易均价' },
                        {field: 'transTotalPrice', title: '交易总价'},
                        {field: 'transFromTo', title: '交易可售' },
                        {field: 'roomUsage', title: '物业类型' },
                        {field: 'roomZhuangXiu', title: '装修情况' },
                        {field: 'roomType', title: '房型' },
                    ]
                ],
                //普通搜索
                commonSearch: true,
                titleForm: '', //为空则不显示标题，不定义默认显示：普通搜索
            });

            // 为表格绑定事件
            Table.api.bindevent(table);
        },
        add: function () {
            Controller.api.bindevent();
        },
        edit: function () {
            Controller.api.bindevent();
        },
        api: {
            bindevent: function () {
                Form.api.bindevent($("form[role=form]"));
            }
        }
    };
    return Controller;
});