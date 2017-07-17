$(function () {
    $('form').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	trainStart:{
        		validators:{
        			notEmpty:{
        				message: '开始时间 不能为空'
        			}
        		}
        	}, 
        
	        trainEnd:{
	    		validators:{
	    			notEmpty:{
	    				message: '结束时间不能为空'
	    			}
	    		}
		    },
		    trainCost:{
        		validators:{
        			notEmpty:{
        				message: '培训费用不能为空'
        			},
        			regexp:{
        				regexp: /^(0|[1-9][0-9]{0,9})(\.[0-9]{1,2})?$/,
        				message: '请输入正确的费用'
        			}
        		}
        	}
        }
    });
});