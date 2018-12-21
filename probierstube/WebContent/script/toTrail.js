function switchTab(newTabID, tabCount, baseClass) {
    for (i=1; i<= tabCount; i++) {
        var thisTab = document.getElementById("tab_" + i);
        setTabClass("copy_" + i, i==newTabID, baseClass);
        if (thisTab!=null)
            thisTab.className = getTabClasses(i, tabCount, i==newTabID);
    }
}
function setTabClass(eltID, toDisplay, baseClass) {
    var elt = document.getElementById(eltID);
    if (elt!=null) {
        if (toDisplay) 
            elt.className = baseClass;
        else 
            elt.className = baseClass + " hiddenItem";
    }
}


function getTabClasses(tabPos, tabCount, isOn) {
    var classStr = "";
    if (isOn) 
        classStr += "on ";
    if (isOn && tabPos==1) 
        classStr += "firstItemOn ";
    if (isOn && tabPos==tabCount) 
        classStr += "lastItemOn ";
    if (tabPos==1) 
        classStr += "firstItem ";
    if (tabPos==tabCount) 
        classStr += "lastItem ";
    return classStr;
}