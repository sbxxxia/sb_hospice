<template>
    <v-app>
        <v-app-bar
                app
                color="transparent"
        >
            <div class="d-flex align-center">
                <v-img id="img"
                        contain
                        src="https://i7.pngflow.com/pngimage/280/90/png-hospital-health-care-medicine-health-sign-medicine-medical-care-patient-clipart.png"
                        transition="scale-transition"
                        width="60"
                />
                <router-link to="/">
                    <h1 class="display-1 black--text font-weight-thin font-italic ml-5 mr-16">
                        hospice palliative care
                    </h1>
                </router-link>
            </div>
            <v-flex sm3 class="ml-16">
                <v-text-field
                        v-model="searchWord"
                        label="Search"
                        single-line
                        append-icon="search"
                        @keyup.enter="search"
                ></v-text-field>
            </v-flex>
            <v-spacer></v-spacer>
            <router-link to="/join">
                <v-btn
                        text
                        flat
                >
                    <span class="black--text">Join</span>
                    <v-icon>mdi-open-in-new</v-icon>
                </v-btn>
            </router-link>
            <router-link to="/login">
                <v-btn
                        text
                        flat
                >
                    <span class="black--text">Login</span>
                    <v-icon>mdi-open-in-new</v-icon>
                </v-btn>
            </router-link>
        </v-app-bar>

        <v-content>
            <vue-page-transition name="fade">
                <router-view/>
            </vue-page-transition>
        </v-content>
    </v-app>
</template>
<script>
    export default {
        data() {
            return {
                searchWord: "기관"
            };
        },
        created() {

        },
        methods: {
            search() {
                if(this.searchWord === '기관'){
                    alert('검색')
                    this.$store.dispatch("retriever/search", this.searchWord);
                }
            }
        }
    };
</script>