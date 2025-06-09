
var projectName = '东理咨询交流论坛';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '学校风采',
	url: './pages/xuexiaofengcai/list.jsp'
}, 
{
	name: '师资力量',
	url: './pages/shizililiang/list.jsp'
}, 
{
	name: '投稿信息',
	url: './pages/tougaoxinxi/list.jsp'
}, 

{
	name: '论坛交流',
	url: './pages/forum/list.jsp'
}, 
{
	name: '系统公告',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm40124/index.jsp";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"学校风采","menuJump":"列表","tableName":"xuexiaofengcai"}],"menu":"学校风采管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"师资力量","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"投稿信息","menuJump":"列表","tableName":"tougaoxinxi"}],"menu":"投稿信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"意见投稿","menuJump":"列表","tableName":"yijiantougao"}],"menu":"意见投稿管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛交流","tableName":"forum"}],"menu":"论坛交流"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学校风采列表","menuJump":"列表","tableName":"xuexiaofengcai"}],"menu":"学校风采模块"},{"child":[{"buttons":["查看"],"menu":"师资力量列表","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量模块"},{"child":[{"buttons":["查看","投稿"],"menu":"投稿信息列表","menuJump":"列表","tableName":"tougaoxinxi"}],"menu":"投稿信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"意见投稿","menuJump":"列表","tableName":"yijiantougao"}],"menu":"意见投稿管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学校风采列表","menuJump":"列表","tableName":"xuexiaofengcai"}],"menu":"学校风采模块"},{"child":[{"buttons":["查看"],"menu":"师资力量列表","menuJump":"列表","tableName":"shizililiang"}],"menu":"师资力量模块"},{"child":[{"buttons":["查看","投稿"],"menu":"投稿信息列表","menuJump":"列表","tableName":"tougaoxinxi"}],"menu":"投稿信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
