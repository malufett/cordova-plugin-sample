/*global cordova, module*/

module.exports = {
    test: function (params, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "TGVoipPlugin", "test", [params]);
    }
};
