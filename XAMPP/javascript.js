// Define event handlers
function attachHandlers(){
    var orderedListButton = document.getElementById("button1");
    orderedListButton.addEventListener("click", function(){
        let title = document.getElementById("list_header");
        //let listItems = document.getElementsByClassName("list_item");

        let orderedList = document.getElementById("ol1");

        let config1 = ["Best desserts", "Butter tart", "Apple pie", "Chocolate cake"];
        let config2 = ["Best fruits", "Oranges", "Apples", "Bananas"];
        let config3 = ["Best takeout", "Chinese", "Indian", "Italian"];
        let config4 = ["Most familiar programming languages", "Python", "C++", "Java"];
        let configList = [config1, config2, config3, config4]

        let numConfigs = configList.length;
        let randConfig = configList[Math.floor(Math.random() * numConfigs)];

        title.innerHTML = randConfig[0];
        orderedList.innerHTML = `\t<li id=\"li1\" class=\"list_item\">${randConfig[1]}</li>\n\t<li id=\"li2\" class=\"list_item\">${randConfig[2]}</li>\n\t<li id=\"li3\" class=\"list_item\">${randConfig[3]}</li>`;

    })

    var resetButton = document.getElementById("resetButton");
    resetButton.addEventListener("click", function(){
        let orderedList = document.getElementById("ol1");
        let title = document.getElementById("list_header");
        let defaultOlHtml = "\t<li id=\"li1\" class=\"list_item\">The first thing in the list</li>\n\t<li id=\"li2\" class=\"list_item\">The second thing in the list</li>\n\t<li id=\"li3\" class=\"list_item\">The third thing in the list</li>";

        title.innerHTML = "Ordered list of things:"
        orderedList.innerHTML = defaultOlHtml;
    })
}

window.addEventListener("load", attachHandlers);