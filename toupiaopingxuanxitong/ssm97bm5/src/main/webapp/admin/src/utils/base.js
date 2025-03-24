const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm97bm5/",
            name: "ssm97bm5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm97bm5/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序投票评选系统的设计与实现+"
        } 
    }
}
export default base
