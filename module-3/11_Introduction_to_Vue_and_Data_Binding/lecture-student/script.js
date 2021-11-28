const myApp = new Vue({

    data() {
        return {
            message: "Yay! It's Friday!",
            firstName: "Lee",
            planets: [
                'Mercury', 'Venus', 'Earth'
            ],
            showDescription: false

        }
    }
});

myApp.$mount('#myApp');