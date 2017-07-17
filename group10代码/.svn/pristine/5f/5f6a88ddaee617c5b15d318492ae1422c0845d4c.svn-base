$(function () {
    $('form').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
	       	"classBag.dept.dname":{
	       		validators:{
	       			notEmpty:{
	       				message: '部门名称不能为空'
	       			}
	       		}
	       	},
	       	"classBag.dept.dptTel":{
	       		validators:{
	       			notEmpty:{
	       				message: '部门电话不能为空'
	       			},
	       			regexp:{
	       				regexp: /(^(0[0-9]{2,3}\-)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?$)|(^0?[1][358][0-9]{9}$)/,
	       				message: '请输入正确的部门电话'
	       			}
	       		}
	       	},
	       	"classBag.dept.upDpt":{
	       		validators:{
	       			notEmpty:{
	       				message: '上属部门不能为空'
	       			}
	       		}
	       	},
	       	"classBag.dept.setupDate":{
	       		validators:{
	       			notEmpty:{
	       				message: '成立日期不能为空'
	       			}
	       		}
	       	},
        }
    });
});