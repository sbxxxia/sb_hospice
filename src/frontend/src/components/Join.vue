<template>
    <v-container>
        <v-form ref="form" v-model="valid" lazy-validation >
            <v-text-field
                    v-model="name"
                    label="Name"
                    required
                    class="mt-16 mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="userid"
                    :counter="10"
                    label="ID"
                    required
                    class="mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="passwd"
                    label="PW"
                    required
                    class="mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="email"
                    label="Email"
                    required
                    class="mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="phoneNumber"
                    label="Phone Number"
                    required
                    class="mb-16 mx-16"
            ></v-text-field>
            <v-divider></v-divider>
            <v-card-actions>
                <v-btn
                        to="/"
                        color="normal"
                >
                    취소
                </v-btn>
                <v-spacer></v-spacer>
                <v-btn
                        color="primary"
                        @click="join"
                >
                    회원가입
                </v-btn>
            </v-card-actions>
        </v-form>
    </v-container>
</template>

<script>
    export default {
        data () {
            return {
                name: '',
                userid: '',
                passwd: '',
                email: '',
                phoneNumber: ''
            }
        },
        methods: {
            join () {
                this.$store.dispatch('user/join', {name:'',userid:'',passwd:'',email:'',phoneNumber:''})
            }
        }
    }
</script>

<style scoped>

</style>