$(function () {
    $('form').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {       	
        	pro_Remark:{
        		validators:{
        			notEmpty:{
        				message: '考核评语不能为空'
        			}
        		}
        	},
        	
        	checkResult:{
        		validators:{
        			notEmpty:{
        				message: '考核结果不能为空'
        			}
        		}
        	},
        	
        	dealDate:{
        		validators:{
        			notEmpty:{
        				message: '处理日期不能为空'
        			}
        		}
        	}
        	
        }
    });
});